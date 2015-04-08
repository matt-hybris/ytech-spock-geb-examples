package ytech

import geb.spock.GebReportingSpec
import ytech.pages.Homepage
import ytech.pages.Search

class GebSpockExample extends GebReportingSpec {

    def "Search for Powershot"() {
        setup: "go to home page"

        to Homepage

        when: "Searching for powershot"

        common.searchForText "Powershot"

        then: "There should be 4 results"

        at Search

        results.size() == 4

    }

}
