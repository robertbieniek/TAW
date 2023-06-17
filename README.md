# TAW
Technologie i aplikacje webowe <br>
Raport Robert Bieniek <br> <br>

### 1. Wprowadzenie przedmiotów do systemu w podanej kolejności <br>
#### a) Nazwa: Metodologie obiektowe, ECTS: 2, Sala: 216, Egzamin: tak, <br>
Metoda: POST <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: <br>
```json
{
    "nazwa": "Metodologie obiektowe",
    "sala": "216",
    "ects": "2",
    "egzamin": "tak"
}
```
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>

#### b) Nazwa: Testowanie oprogramowania, ECTS: 1, Sala: 216, Egzamin: nie <br>
Metoda: POST <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: <br>
```json
{
    "nazwa": "Testowanie oprogramowania",
    "sala": "216",
    "ects": "1",
    "egzamin": "nie"
}
```
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>

#### c) Nazwa: Technologie i aplikacje webowe, ECTS: 3, Sala: 208, Egzamin: nie <br>
Metoda: POST <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: <br>
```json
{
    "nazwa": "Technologie i aplikacje webowe",
    "sala": "208",
    "ects": "3",
    "egzamin": "nie"
}
```
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>

#### d) Nazwa: Zarządzanie projektem informatycznym, ECTS: 2, Sala: 216, Egzamin: nie <br>
Metoda: POST <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: <br>
```json
{
    "nazwa": "Zarządzanie projektem informatycznym",
    "sala": "216",
    "ects": "2",
    "egzamin": "nie"
}
```
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>

#### e) Nazwa: Zaawansowane technologie bazodanowe, ECTS: 3, Sala: 208, Egzamin: nie <br>
Metoda: POST <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: <br>
```json
{
    "nazwa": "Zaawansowane technologie bazodanowe",
    "sala": "208",
    "ects": "3",
    "egzamin": "nie"
}
```
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>

#### f) Nazwa: Technologie komponentowe i sieciowe, ECTS: 2, Sala: 208, Egzamin: tak <br>
Metoda: POST <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: <br>
```json
{
    "nazwa": "Technologie komponentowe i sieciowe",
    "sala": "208",
    "ects": "2",
    "egzamin": "tak"
}
```
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>


### 2.Pobranie wszystkich przedmiotów <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: <br>
```json
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
```

### 3.Pobranie przedmiotów, które mają egzamin <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities?exam=tak <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: <br>
```json
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
```

### 4.Pobranie przedmiotów, które odbywają się w sali 216 <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities?classroom=216 <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: <br>
```json
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
```

### 5.Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208 <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities?exam=nie&classroom=208 <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: <br>
```json
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
```

### 6.Pobranie przedmiotu o identyfikatorze 3 <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities/3 <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: <br>
```json
{
    "id": 3,
    "nazwa": "Technologie i aplikacje webowe",
    "sala": 208,
    "ects": 3,
    "egzamin": "nie"
}
```

### 7.Pobranie przedmiotu o identyfikatorze 15 <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities/15 <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 404 Not Found <br>
Body: brak <br>


### 8.Usunięcie przedmiotu o identyfikatorze 2 <br>
Metoda: DELETE <br>
Adres zasobu: http://localhost:8080/api/activities/2 <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 204 No Content <br>
Body: brak <br>


### 9.Pobranie wszystkich przedmiotów <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: <br>
```json
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
```

### 10.Usunięcie wszystkich przedmiotów <br>
Metoda: DELETE <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br>


### 11.Pobranie wszystkich przedmiotów. <br>
Metoda: GET <br>
Adres zasobu: http://localhost:8080/api/activities <br>
Nagłówki: Content-Type: application/json <br>
Request Body: None <br>
Odpowiedź: <br>
HTTP Code: 200 OK <br>
Body: brak <br> <br>
