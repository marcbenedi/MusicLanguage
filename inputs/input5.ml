func main()
  song();
endfunc

Piezzo song()
  Partitura {
    Tempo n = 120
    Compas 4:4
    Voice Piano || Si Si Si Si
                 |: {(TIME%2)=0} Do.b Re.b |{TIME=2} Mi Fa Sol La | {(TIME=1 or TIME=3)} Si Si Si Si :5 |
                ||

  }
endPiezzo
