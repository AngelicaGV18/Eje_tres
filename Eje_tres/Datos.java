package Eje_tres;

public class Datos {

    private String palabra;
    String letra;

    public Datos(String palabra) {
        this.palabra = palabra;
    }

    public Datos() {
        this.palabra = "";
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String ver_datos() {
        return "PALABRA : " + this.getPalabra();
    }

    public String separar_palabra() {
        String mostrar = "";
        int a = 0, b = 1;

        for (int i = 0; i < this.getPalabra().length(); i++) {

            mostrar += " [" + this.getPalabra().substring(a, b) + "] ";
            a = a + 1;
            b = b + 1;
        }
        return mostrar;
    }

    public int contar_vocales() {
        int cont = 0;
        int a = 0, b = 1;
        for (int i = 0; i < this.getPalabra().length(); i++) {
            if (this.getPalabra().substring(a, b).equals("a") || this.getPalabra().substring(a, b).equals("e") || this.getPalabra().substring(a, b).equals("i") || this.getPalabra().substring(a, b).equals("o") || this.getPalabra().substring(a, b).equals("u")) {
                cont++;
            }
            a = a + 1;
            b = b + 1;
        }
        return cont;
    }

    public String invertir_palabra() {
        String mostrar = "";
        int a = 1, b = 0, c = this.getPalabra().length();
        for (int i = this.getPalabra().length() - 1; i >= 0; i--) {

            mostrar += " [" + this.getPalabra().charAt(i) + "] ";
        }
        return mostrar;
    }

    public void sustituir_vocales_paso_1() {
        String mostrar = "";
        int a = 0, b = 1;
        int aa = 0, bb = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;

        for (int yy = 0; yy < this.getPalabra().length(); yy++) {
            if (this.getPalabra().substring(a, b).equals("a")) {
                aa++;
            } else {
                if (this.getPalabra().substring(a, b).equals("b")) {
                    bb++;
                } else {
                    if (this.getPalabra().substring(a, b).equals("c")) {
                        c++;
                    } else {
                        if (this.getPalabra().substring(a, b).equals("d")) {
                            d++;
                        } else {
                            if (this.getPalabra().substring(a, b).equals("e")) {
                                e++;
                            } else {
                                if (this.getPalabra().substring(a, b).equals("f")) {
                                    f++;
                                } else {
                                    if (this.getPalabra().substring(a, b).equals("g")) {
                                        g++;
                                    } else {
                                        if (this.getPalabra().substring(a, b).equals("h")) {
                                            h++;
                                        } else {
                                            if (this.getPalabra().substring(a, b).equals("i")) {
                                                i++;
                                            } else {
                                                if (this.getPalabra().substring(a, b).equals("j")) {
                                                    j++;
                                                } else {
                                                    if (this.getPalabra().substring(a, b).equals("k")) {
                                                        k++;
                                                    } else {
                                                        if (this.getPalabra().substring(a, b).equals("l")) {
                                                            l++;
                                                        } else {
                                                            if (this.getPalabra().substring(a, b).equals("m")) {
                                                                m++;
                                                            } else {
                                                                if (this.getPalabra().substring(a, b).equals("n")) {
                                                                    n++;
                                                                } else {
                                                                    if (this.getPalabra().substring(a, b).equals("o")) {
                                                                        o++;
                                                                    } else {
                                                                        if (this.getPalabra().substring(a, b).equals("p")) {
                                                                            p++;
                                                                        } else {
                                                                            if (this.getPalabra().substring(a, b).equals("q")) {
                                                                                q++;
                                                                            } else {
                                                                                if (this.getPalabra().substring(a, b).equals("r")) {
                                                                                    r++;
                                                                                } else {
                                                                                    if (this.getPalabra().substring(a, b).equals("s")) {
                                                                                        s++;
                                                                                    } else {
                                                                                        if (this.getPalabra().substring(a, b).equals("t")) {
                                                                                            t++;
                                                                                        } else {
                                                                                            if (this.getPalabra().substring(a, b).equals("u")) {
                                                                                                u++;
                                                                                            } else {
                                                                                                if (this.getPalabra().substring(a, b).equals("v")) {
                                                                                                    v++;
                                                                                                } else {
                                                                                                    if (this.getPalabra().substring(a, b).equals("w")) {
                                                                                                        w++;
                                                                                                    } else {
                                                                                                        if (this.getPalabra().substring(a, b).equals("x")) {
                                                                                                            x++;
                                                                                                        } else {
                                                                                                            if (this.getPalabra().substring(a, b).equals("y")) {
                                                                                                                y++;
                                                                                                            } else {
                                                                                                                if (this.getPalabra().substring(a, b).equals("z")) {
                                                                                                                    z++;

                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a = a + 1;
            b = b + 1;
        }
        ////
        sustituir_vocales_paso_2(aa, bb, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z);

    }

    public void sustituir_vocales_paso_2(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t, int u, int v, int w, int x, int y, int z) {
        String arreglo[] = new String[26];
        int num[] = new int[26];
        int mayor = 0, pos = 0;

        for (int ii = 0; ii < arreglo.length; ii++) {
            arreglo[0] = "a";
            arreglo[1] = "b";
            arreglo[2] = "c";
            arreglo[3] = "d";
            arreglo[4] = "e";
            arreglo[5] = "f";
            arreglo[6] = "g";
            arreglo[7] = "h";
            arreglo[8] = "i";
            arreglo[9] = "j";
            arreglo[10] = "k";
            arreglo[11] = "l";
            arreglo[12] = "m";
            arreglo[13] = "n";
            arreglo[14] = "o";
            arreglo[15] = "p";
            arreglo[16] = "q";
            arreglo[17] = "r";
            arreglo[18] = "s";
            arreglo[19] = "t";
            arreglo[20] = "u";
            arreglo[21] = "v";
            arreglo[22] = "w";
            arreglo[23] = "x";
            arreglo[24] = "y";
            arreglo[25] = "z";
            ////////////////////////////////////////////
            ////////////////////////////////////////////
            ///////////////////////////////////////////
            num[0] = a;
            num[1] = b;
            num[2] = c;
            num[3] = d;
            num[4] = e;
            num[5] = f;
            num[6] = g;
            num[7] = h;
            num[8] = i;
            num[9] = j;
            num[10] = k;
            num[11] = l;
            num[12] = m;
            num[13] = n;
            num[14] = o;
            num[15] = p;
            num[16] = q;
            num[17] = r;
            num[18] = s;
            num[19] = t;
            num[20] = u;
            num[21] = v;
            num[22] = w;
            num[23] = x;
            num[24] = y;
            num[25] = z;

            if (num[ii] > 0) {
                System.out.println(arreglo[ii] + " : " + num[ii]);
                if (num[ii] > mayor) {
                    mayor = num[ii];
                    pos = ii;
                }
            }

        }
        System.out.println("");
        System.out.println("");
        letra = arreglo[pos];
        System.out.println("CADENA QUE MAS SE REPITE ES : (" + letra + ") CON : " + mayor + " VECES");

    }

    public String sustituir_vocales_paso_3() {
        String mostrar = "";
        int a = 0, b = 1;

        for (int i = 0; i < this.getPalabra().length(); i++) {

            if (this.getPalabra().substring(a, b).equals("a") || this.getPalabra().substring(a, b).equals("e") || this.getPalabra().substring(a, b).equals("i") || this.getPalabra().substring(a, b).equals("o") || this.getPalabra().substring(a, b).equals("u")) {
                mostrar += " [" + letra + "] ";
            } else {
                mostrar += " [" + this.getPalabra().substring(a, b) + "] ";
            }
            a = a + 1;
            b = b + 1;
        }
        return mostrar;
    }
}
