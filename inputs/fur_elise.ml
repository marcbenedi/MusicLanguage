func main()
  elise();
endfunc

Piezzo elise()
  Partitura {
    Tempo n = 120
    Compas 3:4
    Voice Piano ||Silenci.b  6Mi.c bm.6Mi.c
                | 6Mi.c bm.6Mi.c 6Mi.c Si.c 6Re.c 6Do.c

                |: La Silenci.c Do.c Mi.c La.c
                | Si Silenci.c Mi.c #.Sol.c Si.c
                | 6Do Silenci.c Mi.c 6Mi.c #.6Re.c
                | 6Mi.c bm.6Mi.c 6Mi.c Si.c 6Re.c 6Do.c
                | La Silenci.c Do.c Mi.c La.c
                | Si Silenci.c Mi.c 6Do.c Si.c

                |{TIME=0} La.b 6Mi.c #.6Re.c
                |{TIME=0} 6Mi.c #.6Re.c 6Mi.c Si.c 6Re.c 6Do.c

                |{TIME=1}La.n Silenci.c Si.c 6Do.c 6Re.c
                |{TIME=1}6Mi.n· Sol.c 6Fa.c 6Mi.c
                |{TIME=1}6Re.n· Fa.c 6Mi.c 6Re.c
                |{TIME=1}6Do.n· Mi.c 6Re.c 6Do.c
                |{TIME=1}Si Silenci.c Mi.c 6Mi.c #.6Re.c //15

                |{TIME=1}6Mi.c #.6Re.c 6Mi.c Mi.c 6Mi.c #.6Re.c
                |{TIME=1}6Mi.c #.6Re.c 6Mi.c Si.c 6Re.c 6Do.c
                |{TIME=1} La Silenci.c Do.c Mi.c La.c
                |{TIME=1} Si.n Silenci.c Mi.c #.Sol.c Si.c
                |{TIME=1} 6Do Silenci.c Mi.c 6Mi.c #.6Re.c //20

                |{TIME=1} 6Mi.c #.6Re.c  6Mi.c Si.c 6Re.c 6Do.c
                |{TIME=1} La.n Silenci.c Do.c Mi.c La.c
                |{TIME=1} Si Silenci.c Mi.c 6Do.c Si.c
                |{TIME=1} La.b [La,6Do,6Mi,6Sol]

                :2|||


   Voice Piano  || Silenci.b Silenci.n
                | Silenci.n Silenci.b
                
                |: 4La.c 4Mi.c 4La.c  Silenci.c Silenci.n
                | 3Mi.c 4Mi.c #.4Sol.c Silenci.c Silenci
                | 3La.c 4Mi.c 4La.c Silenci.c Silenci
                | Silenci.b Silenci.n
                | 4La.c 4Mi.c 4La.c  Silenci.c Silenci.n
                | 3Mi.c 4Mi.c #.4Sol.c Silenci.c Silenci

                |{TIME=0} 3La.c 4Mi.c 4La.c Silenci.c Silenci
                |{TIME=0} Silenci.b Silenci.n

                |{TIME=1} 4La.c 4Mi.c 4La.c Silenci.c Silenci
                |{TIME=1} 4Do.c 4Sol.c Do.c Silenci.c Silenci
                |{TIME=1} 4Sol.c 4Re.c Sol.c Silenci.c Silenci
                |{TIME=1} 4La.c 4Mi.c 4La.c Silenci.c Silenci
                |{TIME=1} 3Mi.c 4Si.c 4Mi.c Silenci.c Silenci //15

                |{TIME=1} Silenci.b Silenci.n
                |{TIME=1} Silenci.b Silenci.n
                |{TIME=1} 4La.c 4Mi.c La.c Silenci.c Silenci
                |{TIME=1} 4Mi.c #.4Sol.c 4Si.c Silenci.c Silenci
                |{TIME=1} 4La.c 4Mi.c 3La.c Silenci.c Silenci.n //20

                |{TIME=1} Silenci.b Silenci
                |{TIME=1} 4La.c 4Mi.c 4La.c Silenci.c Silenci
                |{TIME=1} 4Mi.c #.4Sol.c 4Si.c Silenci.c Silenci
                |{TIME=1} 4La.c Do.c Mi [3La,4Do,4Mi]

                :2|||
  }
endPiezzo
