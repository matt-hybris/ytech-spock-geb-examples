package ytech.modules

import geb.Module
import org.openqa.selenium.Keys

class Common extends Module {

    static content = {
        searchInput { $('#input_SearchBox') }
    }

    def searchForText(text) {

        searchInput.value text

        searchInput << Keys.ENTER
    }

}
