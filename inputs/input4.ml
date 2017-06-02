func main()
  tocar_dos();
  mods_tonalitat();
  duracio();
  puntets();
endfunc

Piezzo tocar_dos()
  Partitura {
    Tempo n = 250
    Compas 4:4
    Voice Piano || 0Do 1Do 2Do 3Do| 4Do 5Do 6Do 7Do| 8Do 9Do 10Do.b||
  }
endPiezzo

Piezzo mods_tonalitat()
  Partitura {
    Tempo n = 250
    Compas 3:4
    Voice Piano || bm.Do Do #.Do||
  }
endPiezzo

Piezzo duracio()
  Partitura {
    Tempo n = 60
    Compas 4:4
    Voice Piano || Do.r | Re.b Re.b|Mi.n Fa.c Fa.c Fa.b| Sol.sc Sol.sc Sol.sc Sol.sc Sol.b·||
  }
endPiezzo

Piezzo puntets()
  Partitura {
    Tempo n = 60
    Compas 2:4
    Voice Piano || Do.n· Do.c | Silenci.n Re.n |Silenci.n Re | Silenci.n· Re.c||
  }
endPiezzo
