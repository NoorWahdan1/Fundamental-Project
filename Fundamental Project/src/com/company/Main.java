package com.company;
import java.util.Scanner;

public class Main {

    public static void character (char ch) {
        if (Character.isLetter(ch)) {
            System.out.println(ch +" Is Letter");
        }
    }

    public static void digit(char ch) {
        if (Character.isDigit(ch)) {
            System.out.println(ch + " Is Integer Digit");
        }
    }

    public static void operator(char ch) {
        if (ch == '=' || ch == '+' ||
                ch == '-' || ch == '*' ||
                ch == '/' || ch == '(' ||
                ch == ')' || ch == '{' ||
                ch == '}') {
            System.out.println(ch +" Is Operator");
        }
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        System.out.println("Enter Equation to get tokens: ");
        String equ = source.nextLine();
        System.out.println();

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                for (int j = 0; j < equ.length(); j++) {
                    character(equ.charAt(j));
                    digit(equ.charAt(j));
                    operator(equ.charAt(j));
                }
            }

            System.out.println();
            
            if (i == 1) {
                System.out.println("Syntax Tree: ");
                char id1 = equ.charAt(0);
                System.out.println("id1 = ");
                System.out.println("     " + "\\");

                if (equ.length() == 7) {
                    if (equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') {
                        System.out.println("      " + equ.charAt(3));
                        System.out.print("    " + "/");
                        System.out.println("   " + "\\");
                    }
                    if (Character.isLetter(equ.charAt(2))) {
                        System.out.print("  " + "id2");
                    } else if (Character.isDigit(equ.charAt(2))) {
                        System.out.print("   " + equ.charAt(2));
                    }

                    if (equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') {
                        System.out.println("     " + equ.charAt(5));
                        System.out.print("        " + "/");
                        System.out.println("   " + "\\");
                    }

                    if (Character.isLetter(equ.charAt(4))) {
                        System.out.print("     " + "id2");
                    } else if (Character.isDigit(equ.charAt(4))) {
                        System.out.print("       " + equ.charAt(4));
                    }

                    if (Character.isLetter(equ.charAt(6))) {
                        System.out.print("    " + "id3");
                    } else if (Character.isDigit(equ.charAt(6))) {
                        System.out.print("        " + equ.charAt(6));
                    }
                }
                else if (equ.length() > 7) {
                    if (equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') {
                        System.out.println("      " + equ.charAt(5));
                        System.out.print("    " + "/");
                        System.out.println("   " + "\\");

                        if (Character.isLetter(equ.charAt(2))) {
                            System.out.print("  " + "id2");
                        } else if (Character.isDigit(equ.charAt(2))) {
                            System.out.print("  " + equ.charAt(2) + equ.charAt(3) + equ.charAt(4));
                        }

                        if (equ.charAt(7) == '*' || equ.charAt(7) == '+' || equ.charAt(7) == '-' || equ.charAt(7) == '/') {
                            System.out.println("     " + equ.charAt(7));
                            System.out.print("        " + "/");
                            System.out.println("   " + "\\");
                        }

                        if (Character.isLetter(equ.charAt(6))) {
                            System.out.print("     " + "id2");
                        } else if (Character.isDigit(equ.charAt(6))) {
                            System.out.print("       " + equ.charAt(6));
                        }

                        if (Character.isLetter(equ.charAt(8))) {
                            System.out.print("    " + "id3");
                        } else if (Character.isDigit(equ.charAt(8))) {
                            System.out.print("        " + equ.charAt(8));
                        }
                    } else if (equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') {
                        System.out.println("      " + equ.charAt(3));
                        System.out.print("    " + "/");
                        System.out.println("   " + "\\");

                        if (Character.isLetter(equ.charAt(2))) {
                            System.out.print("  " + "id2");
                        } else if (Character.isDigit(equ.charAt(2))) {
                            System.out.print("  " + equ.charAt(2) + equ.charAt(3) + equ.charAt(4));
                        }

                        if (equ.charAt(7) == '*' || equ.charAt(7) == '+' || equ.charAt(7) == '-' || equ.charAt(7) == '/') {
                            System.out.println("     " + equ.charAt(7));
                            System.out.print("        " + "/");
                            System.out.println("   " + "\\");
                        }

                        if (Character.isLetter(equ.charAt(4))) {
                            System.out.print("     " + "id2");
                        } else if (Character.isDigit(equ.charAt(4))) {
                            System.out.print("      " + equ.charAt(4) + equ.charAt(5) + equ.charAt(6));
                        }

                        if (Character.isLetter(equ.charAt(8))) {
                            System.out.print("    " + "id3");
                        } else if (Character.isDigit(equ.charAt(8))) {
                            System.out.print("        " + equ.charAt(8));
                        }
                    }
                }
            }

            System.out.println();

            if (i == 2) {
                System.out.println("Semantic Tree: ");
                char id1 = equ.charAt(0);
                System.out.println("id1 = ");
                System.out.println("     " + "\\");

                if (equ.length() == 7) {
                    if (equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') {
                        System.out.println("      " + equ.charAt(3));
                        System.out.print("    " + "/");
                        System.out.println("   " + "\\");
                    }

                    if (Character.isLetter(equ.charAt(2))) {
                        System.out.print("  " + "id2");
                    } else if (Character.isDigit(equ.charAt(2))) {
                        System.out.print("   " + equ.charAt(2));
                    }

                    if (equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') {
                        System.out.println("     " + equ.charAt(5));
                        System.out.print("        " + "/");
                        System.out.println("   " + "\\");
                    }

                    if (Character.isLetter(equ.charAt(4))) {
                        System.out.print("     " + "id2");
                    } else if (Character.isDigit(equ.charAt(4))) {
                        System.out.print("       " + equ.charAt(4));
                    }

                    if (Character.isLetter(equ.charAt(6))) {
                        System.out.print("    " + "id3");
                    } else if (Character.isDigit(equ.charAt(6))) {
                        System.out.print("        " + equ.charAt(6));
                    }
                }
                else if (equ.length() > 7) {
                    if (equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') {
                        System.out.println("      " + equ.charAt(5));
                        System.out.print("    " + "/");
                        System.out.println("   " + "\\");

                        if (Character.isLetter(equ.charAt(2))) {
                            System.out.print("  " + "id2");
                        } else if (Character.isDigit(equ.charAt(2))) {
                            System.out.println("  " + equ.charAt(2) + equ.charAt(3) + equ.charAt(4));
                            System.out.print(" Float");
                        }

                        if (equ.charAt(7) == '*' || equ.charAt(7) == '+' || equ.charAt(7) == '-' || equ.charAt(7) == '/') {
                            System.out.println("     " + equ.charAt(7));
                            System.out.print("        " + "/");
                            System.out.println("    " + "\\");
                        }

                        if (Character.isLetter(equ.charAt(6))) {
                            System.out.print("     " + "id2");
                        } else if (Character.isDigit(equ.charAt(6))) {
                            System.out.print("       " + equ.charAt(6));
                        }

                        if (Character.isLetter(equ.charAt(8))) {
                            System.out.print("    " + "id3");
                        } else if (Character.isDigit(equ.charAt(8))) {
                            System.out.print("        " + equ.charAt(8));
                        }
                    } else if (equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') {
                        System.out.println("      " + equ.charAt(3));
                        System.out.print("    " + "/");
                        System.out.println("   " + "\\");

                        if (Character.isLetter(equ.charAt(2))) {
                            System.out.print("  " + "id2");
                        } else if (Character.isDigit(equ.charAt(2))) {
                            System.out.println("  " + equ.charAt(2) + equ.charAt(3) + equ.charAt(4));
                        }

                        if (equ.charAt(7) == '*' || equ.charAt(7) == '+' || equ.charAt(7) == '-' || equ.charAt(7) == '/') {
                            System.out.println("     " + equ.charAt(7));
                            System.out.print("        " + "/");
                            System.out.println("   " + "\\");
                        }

                        if (Character.isLetter(equ.charAt(4))) {
                            System.out.print("     " + "id2");
                        } else if (Character.isDigit(equ.charAt(4))) {
                            System.out.print("      " + equ.charAt(4) + equ.charAt(5) + equ.charAt(6));
                        }

                        if (Character.isLetter(equ.charAt(8))) {
                            System.out.println("    " + "id3");
                        } else if (Character.isDigit(equ.charAt(8))) {
                            System.out.print("        " + equ.charAt(8));
                        }
                        System.out.println("     Float");
                    }
                }
            }

            System.out.println();

            if (i == 3) {
                System.out.println("ICG: ");
                if (equ.length() == 7) {
                    if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isLetter(equ.charAt(2))) {
                        System.out.println("T1  = " + "id3 " + equ.charAt(5) + " " + equ.charAt(4));
                        System.out.println("T2  = " + "T1  " + equ.charAt(3) + "" + " id2");
                        System.out.println("id1 =" + "T2");
                    } else if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isDigit(equ.charAt(2))) {
                        System.out.println("T1  = " + "id2 " + equ.charAt(5) + " " + "id3");
                        System.out.println("T2  = " + "T1  " + equ.charAt(3) + "" + equ.charAt(3));
                        System.out.println("id1 =" + "T2");
                    }
                }
                else if ((equ.length() > 7)) {
                    if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isLetter(equ.charAt(2))) {
                        System.out.println("T1  = " + "intToFloat(" + equ.charAt(4) + ")");
                        System.out.println("T2  = " + "T1  " + equ.charAt(7) + "" + " id3");
                        System.out.println("T3  = " + "T2  " + equ.charAt(3) + "" + " id2");
                        System.out.println("id1 =" + "T3");
                    } else if ((equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') && Character.isDigit(equ.charAt(2))) {
                        System.out.println("T1  = " + "intToFloat(" + equ.charAt(2) + ")");
                        System.out.println("T2  = " + "id2  " + equ.charAt(7) + "" + " id3");
                        System.out.println("T3  = " + "T2  " + equ.charAt(5) + "" + " T1");
                        System.out.println("id1 =" + "T3");
                    }
                }
            }

            System.out.println();

            if (i == 4) {
                System.out.println("Code Optimizer: ");
                if (equ.length() == 7) {
                    if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isLetter(equ.charAt(2))) {
                        System.out.println("T1   = " + "id3 " + equ.charAt(5) + " " + equ.charAt(4));
                        System.out.println("id1  = " + "T1  " + equ.charAt(3) + " " + " id2");
                    } else if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isDigit(equ.charAt(2))) {
                        System.out.println("T1   = " + "id2 " + equ.charAt(5) + " " + "id3");
                        System.out.println("id1  = " + "T1  " + equ.charAt(3) + " " + equ.charAt(2));
                    }
                }
                else if ((equ.length() > 7)) {
                    if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isLetter(equ.charAt(2))) {
                        System.out.println("T1   = " + "id3 " + equ.charAt(7) + " #" + equ.charAt(4) + equ.charAt(5) + equ.charAt(6));
                        System.out.println("id1  = " + "T1  " + equ.charAt(3) + "" + " id2");
                    } else if ((equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') && Character.isDigit(equ.charAt(2))) {
                        System.out.println("T1   = " + "#" + equ.charAt(2) + equ.charAt(3) + equ.charAt(4));
                        System.out.println("T2   = " + "id2 " + equ.charAt(7) + "" + " id3");
                        System.out.println("id1  = " + "T2  " + equ.charAt(5) + "" + " T1");
                    }
                }
            }

            System.out.println();

            if (i == 5) {
                System.out.println("Code Generator: ");
                if (equ.length() == 7) {
                    if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isLetter(equ.charAt(2))) {
                        System.out.println("LD  " + "R1" + "," + "id3" );
                        System.out.println("MUL " + "R1" + "," + "R1" + "," + equ.charAt(4));
                        System.out.println("LD  " + "R2" + "," + "id2");
                        System.out.println("ADD " + "R1" + "," + "R1" + "," + "R2");
                        System.out.println("STR " + "id1" + "," + "R1");
                    } else if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isDigit(equ.charAt(2))) {
                        System.out.println("LD  " + "R1" + "," + "id2" );
                        System.out.println("MUL " + "R1" + "," + "R1" + "," + "id3");
                        System.out.println("ADD " + "R1" + "," + "R1" + "," + equ.charAt(2));
                        System.out.println("STR " + "id1" + "," + "R1");
                    }
                }
                else if ((equ.length() > 7)) {
                    if ((equ.charAt(3) == '*' || equ.charAt(3) == '+' || equ.charAt(3) == '-' || equ.charAt(3) == '/') && Character.isLetter(equ.charAt(2))) {
                        System.out.println("LDF  " + "R2" + "," + "id3" );
                        System.out.println("MULF " + "R2" + "," + "R2" + "," + equ.charAt(4) + equ.charAt(5) + equ.charAt(6));
                        System.out.println("LDF  " + "R1" + "," + "id2");
                        System.out.println("ADDF " + "R1" + "," + "R1" + "," + "R2");
                        System.out.println("STRF " + "id1" + "," + "R1");
                    } else if ((equ.charAt(5) == '*' || equ.charAt(5) == '+' || equ.charAt(5) == '-' || equ.charAt(5) == '/') && Character.isDigit(equ.charAt(2))) {
                        System.out.println("LDF  " + "R1" + "," + "id2" );
                        System.out.println("MULF " + "R1" + "," + "R1" + "," + "id3");
                        System.out.println("ADDF " + "R1" + "," + "R1" + "," + equ.charAt(2) + equ.charAt(3) + equ.charAt(4));
                        System.out.println("STRF " + "id1" + "," + "R1");
                    }
                }
            }
        }
    }
}