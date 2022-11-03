package org.grails.demo

import grails.boot.Grails
import grails.util.Environment

import groovy.transform.CompileStatic

@CompileStatic
class Application {

    static void main(String[] args) {
        Grails.run(Application, args)

        println "Reloading enabled? " + Environment.isReloadingAgentEnabled()
    }

}