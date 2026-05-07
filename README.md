# interactive-web-quest

Web-based text quest built with Java Servlets, JSP and Maven.

## *1. Стек технологий*

```text
1. Java 21
2. Maven 
3. Servlet API 4.0
```

## *2. Функционал*

```text
Приложение веб-квест, которое принимает решения пользователя, хранит состояния игры, показывает результат.
```
```mermaid
graph TD
    %% --- Начало ---
    Start((Начало)) --> Reg[Ввод Имени]
    Reg --> Init[Lucidity=100, Fragments=0]
    Init --> S1

    %% --- Слайд 1 ---
    S1{{"Слайд 1: Холл"}}
    S1 -->|Выбор А: Лифт| S1_A[L -35]
    S1 -->|Выбор Б: Лестница| S1_B[F +1]

    S1_A --> S3
    S1_B --> S2

    %% --- Слайд 2 ---
    S2{{"Слайд 2: Коридор"}}
    S2 -->|А: Коснуться| S2_A[F +1, L -20]
    S2 -->|Б: Убежать| S2_B[L +5]

    S2_A --> S3
    S2_B --> S3

    %% --- Слайд 3 ---
    S3{{"Слайд 3: Номер 104"}}
    S3 -->|А: Читать| S3_A[F +1, L -30]
    S3 -->|Б: Искать выход| S3_B[L -10]

    %% Проверки на Слайде 3
    S3_B --> Check3{L < 40?}
    S3_A --> Check3{L < 40?}
    Check3 -->|Да| Timelessness((Поражение: <БЕЗВРЕМЕНЬЕ>))
    Check3 -->|Нет| S4


    %% --- Слайд 4 ---
    S4{{"Слайд 4: Финал"}}
    S4 --> FinalChoice{Финальный выбор}

    FinalChoice -->|А: Ключ| CleanSheet((Победа: СТЕРТАЯ ПАМЯТЬ))
    FinalChoice -->|Б: Альбом| SF_B[L -40]
    SF_B --> CheckF{F >= 2 && L >= 30?}

    %% Проверки финала
    CheckF -->|Нет| Defeat((Поражение: ПОТЕРЯ РАССУДКА))
    CheckF -->|Да| TrueFinal((Победа: ИСТИННОЕ Я))

    %% Стили
    style TrueFinal fill:#9f9,stroke:#333
    style CleanSheet fill:#9f9,stroke:#333
    style Timelessness fill:#f99,stroke:#333
    style Defeat fill:#f99,stroke:#333
```


## *3. Инструкция по запуску*

```text
Требует Java 21 и Maven 3.9
```

