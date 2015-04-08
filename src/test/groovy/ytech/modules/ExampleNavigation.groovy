package ytech.modules

import geb.Module

/**
 * Created by Matt Rossner on 4/8/15.
 */
class ExampleNavigation extends Module { // modules must extend geb.Module

    static content = { // here we can define the shared content
        homeLink { $('#home') }
        camerasLink { $('#cameras') }
        accessoriesLink { $('#accessories') }
        // rest of links...
    }
}
