/*
Create a PersistenceServiceProcessor bean post processor that outputs "persistence bean initialized"
when a the bg.jug.academy.string.demo.model.PersistenceService bean is initialized.
*/
package bg.jug.academy.string.demo.model.PersistenceService;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class PersistanceServiceProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization (Object bean, String beanName) {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization (Object bean, String beanName) {
        if (bean instanceof bg.jug.academy.string.demo.model.PersistenceService) {
            System.out.println("persistence bean initialized");
        }
        return bean;
    }
}
