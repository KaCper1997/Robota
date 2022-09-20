## Zadanie 1

W pakiecie `pl.coderslab.homework.exceptions`, w pliku `Main01.java` umieść metodę o sygnaturze `public static void average(String a, String b)`.

1. Uzupełnij ciało metody tak, aby dokonała konwersji zmiennych `a` i `b` na typ liczbowy `int` i wykonała dzielenie zmiennej `a` przez zmienną `b`.
2. Zabezpiecz program przed możliwymi błędami.
3. Dodaj sekcję, która wykona się zawsze niezależnie od tego czy wystąpi błąd czy nie.
## Zadanie 2

W pakiecie `pl.coderslab.homework.exceptions`, w pliku `Main02.java` umieść metodę o sygnaturze `public static String safeGet(String[] strTab, int index)`.

1. Uzupełnij ciało metody tak, aby zwracała element tablicy `strTab` zawarty pod indeksem `index`.
2. Dodaj obsługę odpowiedniego wyjątku.
3. Przetestuj działanie programu.
## Zadanie 3

W pakiecie `pl.coderslab.homework.exceptions`, w pliku `Main03.java` umieść metodę o sygnaturze `public static int getLength(String str)`.

1. Uzupełnij ciało metody tak, aby zwracała długość napisu `str`.
2. Przetestuj działanie metody przekazując do niej parametr o wartości `null`.
3. Zabezpiecz program przed wystąpieniem wyjątku `NullPointerException`.
## Zadanie 4

W pakiecie `pl.coderslab.homework.exceptions`, w pliku `Main04.java` umieść metodę o sygnaturze `public static int toInt(String str)`.

1. Uzupełnij ciało metody tak, aby zwracała napis `str` zamieniony na typ `int`,
2. Obsłuż możliwe wyjątki.
## Zadanie 5

W pakiecie `pl.coderslab.homework.exceptions`, w pliku `Main05.java` umieść metodę o sygnaturze `public static int indexOf(int[] elements, int value)`.

1. Uzupełnij ciało metody tak, aby zwracała index elementu `value` zawartego w tablicy `elements`.
2. Jeśli tablica nie posiada podanego elementu zwróć wyjątek `NoSuchElementException`. 
3. Przetestuj działanie programu wywołując metodę `indexOf` z elementem, który występuje w tablicy i z takim, który w niej nie występuje. 
4. Przy wywołaniu metody `indexOf` dodaj obsługę wyjątku `NoSuchElementException`.
5. Przetestuj ponownie działanie programu.
