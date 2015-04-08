package ytech

import geb.spock.GebReportingSpec
import spock.lang.Specification
import ytech.pages.ExampleLoginPage
import ytech.pages.Homepage

/**
 * Created by Matt Rossner on 4/8/15.
 */
class ExampleLoginTest extends GebReportingSpec { // tests must extend geb.spock.GebReportingSpec
    def "Test login works"() {

        setup: "Go to login page" // this is a comment

        to ExampleLoginPage

        when: "Logging in"

        login(user, pass)

        then: "Should arrive at homepage"

        at Homepage

        where:

        user                |   pass
        'user1@test.com'    |   1234
        'user2@test.com'    |   4321
        'user3@test.com'    |   5678
        'user4@test.com'    |   8765
    }
}
