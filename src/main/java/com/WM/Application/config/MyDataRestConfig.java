package com.WM.Application.config;

import com.WM.Application.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private EntityManager entityManager;

    @Autowired
    public MyDataRestConfig(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};

        disableMethodsForClass(config, InternalOrderHasStatus.class, theUnsupportedActions);
        disableMethodsForClass(config, InternalOrderItem.class, theUnsupportedActions);
        disableMethodsForClass(config, InternalOrder.class, theUnsupportedActions);
        disableMethodsForClass(config, InternalOrderStatus.class, theUnsupportedActions);
        disableMethodsForClass(config, Material.class, theUnsupportedActions);
        disableMethodsForClass(config, MaterialCategory.class, theUnsupportedActions);
        disableMethodsForClass(config, MaterialPriceHistory.class, theUnsupportedActions);
        disableMethodsForClass(config, OrderHasOrderStatus.class, theUnsupportedActions);
        disableMethodsForClass(config, OrderItem.class, theUnsupportedActions);
        disableMethodsForClass(config, Order.class, theUnsupportedActions);
        disableMethodsForClass(config, OrderStatus.class, theUnsupportedActions);

        exposeIds(config);
    }

    private void disableMethodsForClass(RepositoryRestConfiguration config, Class clazz, HttpMethod[] theUnsupportedActions) {
        config.getExposureConfiguration()
                .forDomainType(clazz)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
    }

    private void exposeIds(RepositoryRestConfiguration config) {
        config.exposeIdsFor(InternalOrderHasStatus.class);
        config.exposeIdsFor(InternalOrderItem.class);
        config.exposeIdsFor(InternalOrder.class);
        config.exposeIdsFor(InternalOrderStatus.class);
        config.exposeIdsFor(Material.class);
        config.exposeIdsFor(MaterialCategory.class);
        config.exposeIdsFor(MaterialPriceHistory.class);
        config.exposeIdsFor(OrderHasOrderStatus.class);
        config.exposeIdsFor(OrderItem.class);
        config.exposeIdsFor(Order.class);
        config.exposeIdsFor(OrderStatus.class);

        // Get a list of all entity classes from the entity manager
        Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();

        // Create an array of the entity types
        List<Class> entityClasses = new ArrayList<>();

        // Get the entity types for the entities
        for (EntityType tempEntityType : entities) {
            entityClasses.add(tempEntityType.getJavaType());
        }

        // Expose the entity ids for the array of entity/domain types
        Class[] domainTypes = entityClasses.toArray(new Class[0]);
        config.exposeIdsFor(domainTypes);
    }
}
