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

## Stylowanie treści

Na górze i dole strony są 2 paski, które mają ustawioną szerokość na 80%. Między nimi znajduje się element `.content`, czyli treść strony na białym tle. 

Ustawmy temu elementowi stylowanie:
* maksymalną szerokość (max-width) na **80%**,
* wewnętrzny odstęp od krawędzi elementu **50px** z każdej strony,

Jak widzimy, po zastosowaniu powyższych właściwości nasz element jest nieco szerszy od dolnego i górnego paska. Z czego to wynika? Spróbujmy to zastosować za pomocą właściwości **box-sizing**.


## Stylowanie przycisków

W treści strony znajduje się element `.btn`. 

Zastosujmy dla niego stylowanie:
* odstęp wewnętrzny ustawiony na `20px 40px`,
* margines dolny `20px`.

Jak widzisz element nie do końca dobrze się wyświetla. Wynika to z faktu, że jest to ostylowany link, a linki mają domyślnie wyświetlanie typu `inline`. Czym takie wyświetlanie się charakteryzuje? Zmień je na odpowiednie.


## Galeria

Na samym dole strony jest galeria o klasie `.gallery`. W jej wnętrzu znajduje się lista zdjęć o klasie `.gallery-content`, w której znajdują się ułożone poziomo zdjęcia. Niestety nie mieszczą się one w poziomie, a klient nie chce by zajmowały więcej miejsca w pionie (więc nie mogą się zawijać). Za pomocą odpowiedniej właściwości spraw, by pojawił się poziomy pasek przewijania w elemencie `.gallery-content`. 

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
