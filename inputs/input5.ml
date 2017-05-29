func main()
  song();
endfunc

Piezzo song()
  Partitura {
    Tempo n = 120
    Compas 4:4
    Voice Piano || Do Re Mi Mi Mi Re Mi Re Do
                 |: {(TIME%2)=0} Do Re |{TIME=2} Mi Fa Sol La | {(TIME=1 or TIME=3)} Si Si Si Si :5 |
                ||

  }
endPiezzo
