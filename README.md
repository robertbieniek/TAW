# TAW
Technologie i aplikacje webowe
Raport Robert Bieniek


1. Wprowadzenie przedmiotów do systemu w podanej kolejności
a) Nazwa: Metodologie obiektowe, ECTS: 2, Sala: 216, Egzamin: tak,
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
    "nazwa": "Metodologie obiektowe",
    "sala": "216",
    "ects": "2",
    "egzamin": "tak"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak

b) Nazwa: Testowanie oprogramowania, ECTS: 1, Sala: 216, Egzamin: nie,
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
    "nazwa": "Testowanie oprogramowania",
    "sala": "216",
    "ects": "1",
    "egzamin": "nie"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak

c) Nazwa: Technologie i aplikacje webowe, ECTS: 3, Sala: 208, Egzamin: nie,
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
    "nazwa": "Technologie i aplikacje webowe",
    "sala": "208",
    "ects": "3",
    "egzamin": "nie"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak

d) Nazwa: Zarządzanie projektem informatycznym, ECTS: 2, Sala: 216, Egzamin: nie,
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
    "nazwa": "Zarządzanie projektem informatycznym",
    "sala": "216",
    "ects": "2",
    "egzamin": "nie"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak

e) Nazwa: Zaawansowane technologie bazodanowe, ECTS: 3, Sala: 208, Egzamin: nie
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
    "nazwa": "Zaawansowane technologie bazodanowe",
    "sala": "208",
    "ects": "3",
    "egzamin": "nie"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak

f) Nazwa: Technologie komponentowe i sieciowe, ECTS: 2, Sala: 208, Egzamin: tak
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
    "nazwa": "Technologie komponentowe i sieciowe",
    "sala": "208",
    "ects": "2",
    "egzamin": "tak"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak


2. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body:
[
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "sala": 216,
        "ects": 2,
        "egzamin": "tak"
    },
    {
        "id": 2,
        "nazwa": "Testowanie oprogramowania",
        "sala": 216,
        "ects": 1,
        "egzamin": "nie"
    },
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "sala": 208,
        "ects": 3,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "sala": 216,
        "ects": 2,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "sala": 208,
        "ects": 3,
        "egzamin": "nie"
    },
    {
        "id": 6,
        "nazwa": "Technologie komponentowe i sieciowe",
        "sala": 208,
        "ects": 2,
        "egzamin": "tak"
    }
]


3. Pobranie przedmiotów, które mają egzamin
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?exam=tak
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body:
[
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "sala": 216,
        "ects": 2,
        "egzamin": "tak"
    },
    {
        "id": 6,
        "nazwa": "Technologie komponentowe i sieciowe",
        "sala": 208,
        "ects": 2,
        "egzamin": "tak"
    }
]


4. Pobranie przedmiotów, które odbywają się w sali 216
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?classroom=216
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body:
[
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "sala": 216,
        "ects": 2,
        "egzamin": "tak"
    },
    {
        "id": 2,
        "nazwa": "Testowanie oprogramowania",
        "sala": 216,
        "ects": 1,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "sala": 216,
        "ects": 2,
        "egzamin": "nie"
    }
]


5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?exam=nie&classroom=208
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body:
[
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "sala": 208,
        "ects": 3,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "sala": 208,
        "ects": 3,
        "egzamin": "nie"
    }
]


6. Pobranie przedmiotu o identyfikatorze 3
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities/3
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body:
{
    "id": 3,
    "nazwa": "Technologie i aplikacje webowe",
    "sala": 208,
    "ects": 3,
    "egzamin": "nie"
}


7. Pobranie przedmiotu o identyfikatorze 15
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities/15
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 404 Not Found
Body: brak


8. Usunięcie przedmiotu o identyfikatorze 2
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/activities/2
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 204 No Content
Body: brak


9. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body:
[
    {
        "id": 1,
        "nazwa": "Metodologie obiektowe",
        "sala": 216,
        "ects": 2,
        "egzamin": "tak"
    },
    {
        "id": 3,
        "nazwa": "Technologie i aplikacje webowe",
        "sala": 208,
        "ects": 3,
        "egzamin": "nie"
    },
    {
        "id": 4,
        "nazwa": "Zarządzanie projektem informatycznym",
        "sala": 216,
        "ects": 2,
        "egzamin": "nie"
    },
    {
        "id": 5,
        "nazwa": "Zaawansowane technologie bazodanowe",
        "sala": 208,
        "ects": 3,
        "egzamin": "nie"
    },
    {
        "id": 6,
        "nazwa": "Technologie komponentowe i sieciowe",
        "sala": 208,
        "ects": 2,
        "egzamin": "tak"
    }
]


10. Usunięcie wszystkich przedmiotów
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body: brak


11. Pobranie wszystkich przedmiotów.
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: None
Odpowiedź:
HTTP Code: 200 OK
Body: brak
