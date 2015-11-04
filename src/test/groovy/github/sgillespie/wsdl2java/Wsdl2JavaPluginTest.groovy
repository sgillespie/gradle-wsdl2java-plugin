package github.sgillespie.wsdl2java

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class Wsdl2JavaPluginTest extends Specification {
    Project project

    def setup() {
        project = ProjectBuilder
                .builder()
                .build()
    }

    def "applies wsdl2java plugin"() {
        when:
        project.apply plugin: 'github.sgillespie.wsdl2java'

        then:
        project.plugins.hasPlugin 'github.sgillespie.wsdl2java'
    }
}
