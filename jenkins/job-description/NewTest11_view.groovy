 
listView('NewTest11 Jobs') {
    description('NewTest11 Jobs')
    jobs {
        regex('NewTest11_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
