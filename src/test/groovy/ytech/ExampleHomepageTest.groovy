package ytech

import geb.spock.GebReportingSpec
import ytech.pages.ExampleHomepage

/**
 * Created by Matt Rossner on 4/8/15.
 */
class ExampleHomepageTest extends GebReportingSpec {
    def "homepage test"() {
        setup: "go to homepage"
        to ExampleHomepage

        when: "click camera link"
        navigation.camerasLink.click()


        then: "at camera category page"

        // usual checks...
    }
}
