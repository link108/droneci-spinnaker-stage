package com.github.odusanya18.igor

import com.github.odusanya18.droneci.config.DroneCIProperties
import com.github.odusanya18.igor.controller.DroneCIController
import com.netflix.spinnaker.kork.plugins.api.spring.PrivilegedSpringPlugin
import org.pf4j.PluginWrapper
import org.springframework.beans.factory.support.BeanDefinitionRegistry


class DroneCIPlugin(wrapper: PluginWrapper) : PrivilegedSpringPlugin(wrapper) {
    override fun registerBeanDefinitions(registry: BeanDefinitionRegistry) {
        listOf(
            DroneCIController::class.java,
            DroneCIProperties::class.java
        ).forEach {
            registerBean(beanDefinitionFor(it), registry)
        }
    }
}