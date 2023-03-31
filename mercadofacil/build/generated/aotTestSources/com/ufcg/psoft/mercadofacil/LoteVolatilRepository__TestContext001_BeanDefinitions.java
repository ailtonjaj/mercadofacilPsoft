package com.ufcg.psoft.mercadofacil;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LoteVolatilRepository}
 */
public class LoteVolatilRepository__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'loteVolatilRepository'
   */
  public static BeanDefinition getLoteVolatilRepositoryBeanDefinition() {
    Class<?> beanType = LoteVolatilRepository.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(LoteVolatilRepository::new);
    return beanDefinition;
  }
}
