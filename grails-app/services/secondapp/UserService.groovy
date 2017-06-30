package secondapp

import db.User
import grails.transaction.Transactional

@Transactional
class UserService {

    def getStaticUser() {
        return new User(username: "Anonymous",
                password: "Real Programmers Don't eat much quicheQuiche",
                email:"ketan@jft.com")
    }
    def getRandomQuote() {
        def allUser = User.list()
        def randomUser = null
        if (allUser.size() > 0) {
            def randomIdx = new Random().nextInt(allUser.size())
            randomUser = allUser[randomIdx]
        } else {
            randomUser = getStaticUser()
        }
        return randomUser
    }
}
