package ytech

import spock.lang.Specification
import spock.lang.Unroll

class SpockExample extends Specification {

    def "Test math class"() {

        expect:

        Math.max(a, b) == c

        where:

        a   |   b   |   c
        1   |   2   |   2
        4   |   1   |   4
        3   |   3   |   3
    }

}
