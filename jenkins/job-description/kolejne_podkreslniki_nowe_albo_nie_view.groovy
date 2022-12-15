 
listView('kolejne_podkreslniki_nowe_albo_nie Jobs') {
    description('kolejne_podkreslniki_nowe_albo_nie Jobs')
    jobs {
        regex('kolejne_podkreslniki_nowe_albo_nie_.+')
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
