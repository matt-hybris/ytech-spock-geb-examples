package ytech.pages

import geb.Page

/**
 * Created by Matt Rossner on 4/8/15.
 */
class ExampleLoginPage extends Page { // pages must extend geb.Page

    static url = '/login' // URL can be absolute, or relative is baseUrl is set

    static at = { // we generally check that we are at a page by checking its' title
                  // but it's not the only way
                  // we can add as many checks here as we like
        title == 'Bienvenue - Connexion'
    }

    static content = { // all content defined here is accessible when at this page
        username { $('#j_username') }
        password { $('#j_password') }
        loginButton { $('#loginForm button') }
    }

    def login(username, password) { // when at this page, we can call this method to login
        username.value username
        password.value password

        loginButton.click()
    }
}
