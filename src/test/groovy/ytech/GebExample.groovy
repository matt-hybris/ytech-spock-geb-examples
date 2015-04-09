package ytech

import geb.Browser
import org.openqa.selenium.Keys

Browser.drive {
    go "http://electronics.local:9101/yacceleratorstorefront/"

    assert title == 'Electronics Site | Homepage'

    searchInput = $('#input_SearchBox')
    searchInput.value 'Powershot'
    searchInput << Keys.ENTER

    results = find 'div.productListItem'

    assert results.size() == 4

    close()
}
