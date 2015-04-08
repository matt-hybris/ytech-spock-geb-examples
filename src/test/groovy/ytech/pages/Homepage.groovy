package ytech.pages

import geb.Page
import ytech.modules.Common

class Homepage extends Page {

    static url = "/yacceleratorstorefront/"
    static at = {title == 'Electronics Site | Homepage'}
    static content = {
        common { module Common }
    }
}
