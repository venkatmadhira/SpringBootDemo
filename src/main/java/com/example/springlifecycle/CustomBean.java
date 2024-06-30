    package com.example.springlifecycle;
    import org.springframework.beans.BeansException;
    import org.springframework.beans.factory.BeanFactory;
    import org.springframework.beans.factory.BeanFactoryAware;
    import org.springframework.beans.factory.DisposableBean;
    import org.springframework.beans.factory.InitializingBean;
    import org.springframework.beans.factory.BeanNameAware;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.ApplicationContextAware;
    import org.springframework.stereotype.Component;
    import javax.annotation.PostConstruct;
    import javax.annotation.PreDestroy;

    @Component
    public class CustomBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

        public CustomBean() {
            System.out.println("CustomBean: Constructor");
        }

        @Override
        public void setBeanName(String name) {
            System.out.println("setBeanName: " + name);
        }

        @Override
        public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
            System.out.println("setBeanFactory: " + beanFactory);
        }

        @Override
        public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            System.out.println("setApplicationContext: " + applicationContext);
        }

        @PostConstruct
        public void postConstruct() {
            System.out.println("@PostConstruct: CustomBean");
        }

        @Override
        public void afterPropertiesSet() throws Exception {
            System.out.println("afterPropertiesSet: CustomBean");
        }

        public void customInit() {
            System.out.println("Custom Init Method: CustomBean");
        }

        @PreDestroy
        public void preDestroy() {
            System.out.println("@PreDestroy: CustomBean");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println("destroy: CustomBean");
        }

        public void customDestroy() {
            System.out.println("Custom Destroy Method: CustomBean");
        }
    }
