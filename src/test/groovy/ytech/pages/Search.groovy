package ytech.pages

import geb.Page
import ytech.modules.Common

class Search extends Page {

    static at = {title ==~ /Search.*$/}
    static content = {
        common { module Common }

        results { $('div.productListItem') }
    }

}
