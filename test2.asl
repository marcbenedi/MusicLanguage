func main()
vel = 60 * 2;
  sonata(vel)
endfunc

Piezzo sonata(vel)
  Partitura {
    Tempo n=vel
    Compas 2:4
    Voice Marc ||{TIME=2, Adagio, f} 7La.n· Re [Re,Re]| La Si Do ||
  }
endPiezzo
