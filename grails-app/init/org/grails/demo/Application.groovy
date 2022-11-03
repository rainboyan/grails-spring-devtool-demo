package org.grails.demo

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import grails.util.Environment

import groovy.transform.CompileStatic

@CompileStatic
class Application extends GrailsAutoConfiguration {

    static void main(String[] args) {
        GrailsApp.run(Application, args)

        println "Reloading enabled? " + Environment.isReloadingAgentEnabled()
    }

}