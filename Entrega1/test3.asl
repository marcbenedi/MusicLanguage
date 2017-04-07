func main()
 vel = 60 * 2;
  a = 0;
  while a < 10 do
    sonata(vel);
    a = a + 1;
  endwhile;
  nocturne(a);
endfunc

Piezzo sonata(vel)
  Partitura {
    Tempo n=vel
    Compas 2:4
    Voice Marc ||{TIME=2, Adagio, f} 7La.n· Re [Re,Re]| La Si Do ||
  }
endPiezzo


Piezzo sonata(a)
  Partitura {
    Tempo Adagio
    Compas a:4
    Voice Hermes || [Do,Re,Mi] | Do #.7Re ||
  }
endPiezzo
