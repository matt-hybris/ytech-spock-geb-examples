package ytech.pages

import geb.Page
import ytech.modules.ExampleNavigation

/**
 * Created by Matt Rossner on 4/8/15.
 */
class ExampleHomepage extends Page {
    static content = {
        navigation { module ExampleNavigation }
    }
}
