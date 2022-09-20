![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`
Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
4. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
5. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

Poszczególne zadania rozwiązuj w odpowiednich plikach.

# Poniżej znajdziesz wytyczne do zadań

> W katalogu z ćwiczeniem znajdziesz plik `index.html`. Otwórz go w przeglądarce WWW (wystarczy jeżeli klikniesz na niego dwa razy).  
> Otwórz też pliki przygotowane do tego zadania w wybranym przez siebie edytorze kodu (WebStorm, Visual Studio Code). 

Naszym celem jest poprawienie wyglądu strony. Wykonaj zadanie przez dopisanie stylowania do odpowiednich selektorów znajdujących się w pliku **style.css**.


## Karty z użytkownikami

Upiększmy karty z użytkownikami.
Do elementu o klasie **.user** dodaj:
* cień o parametrach: x: `0`. y: `1px`, rozmycie: `15px`, kolor: `rgba(0,0,0,0.1)`,
* zaokrąglenie rogów o wartości `3px`


## Awatar

Zaokrąglijmy zdjęcie z użytkownikiem, tak by było kołem.
Do elementu o klasie **.user-avatar** dodajmy:
* zaokrąglenie rogów o wartości `50%`


## Linki

Ostatnim elementem jakim się zajmiemy są dolne linki. Niech wyglądają jak buttony.

W tym celu do elementu o klasie **.user-btn** dodajmy:
* tło o kolorze **#4950F6**,
* kolor tekstu ustawiony na **#fff**,
* cień **0 2px 10px rgba(73,80,246, 0.4)**;
* usuńmy podkreślenie tekstu,
* ustawmy linkowi wyświetlanie **inline-block**,
* dodajmy odstęp od krawędzi na **20px 40px**,
* dodajmy zaokrąglenie rogów na **40px**.


---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
