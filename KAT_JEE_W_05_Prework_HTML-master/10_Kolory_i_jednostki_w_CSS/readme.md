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


Strona przykładowa zawiera opis Pragi i galerią zdjęć. Naszym celem jest poprawienie jej wyglądu.


## Kontener z treścią

Pierwszą rzeczą jaką poprawimy to kontener z treścią. Jest to element o klasie `.container`. 
Zastosujmy dla niego stylowanie:

* szerokość : **680px**,
* maksymalna szerokość (właściwość max-width): **90%**,    
* odstęp tekstu od krawędzi kontenera: **50px**,
* kolor tła: **rgba(255, 255, 255, 0.95)**,    
* wielkość tekstu: **15px**,
* wielkość interlinii: **1.5em**,
* kolor tekstu: **rgba(0, 0, 0, 0.6)**.


## Nagłówki

Kolejnym elementem będzie wygląd nagłówków `h1, h2`.

Dodajmy im stylowanie:
* kolor tekstu: **#b4411e**,
* wielkość tekstu: **32px**,
* wielkość interlinii: **1em**.


## Galeria

### Część 1

Zajmijmy się teraz galerią. Znajdują się w niej linki ze zdjęciami, czyli elementy `.gallery a`

Nadajmy im stylowanie:
* max-width: **50%**,
* padding: **3px**.


### Część 2

Nawet gdy nadaliśmy linkom szerokość na 50%, zdjęcia wciąż się w tych linkach nie mieszczą. Wynika to z faktu, że grafiki img domyślnie wyświetlają się w swoich oryginalnych rozmiarach. Poprawny to.

Dla elementów `.gallery img` dodajmy stylowanie:
* maksymalna szerokość (max-width) na **100%**

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
