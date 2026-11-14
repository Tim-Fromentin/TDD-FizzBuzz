# fr.cda.fizzbuzz.FizzBuzz en TDD

Kata fr.cda.fizzbuzz.FizzBuzz réalisé en **Test-Driven Development** (TDD), en Java avec JUnit et AssertJ.

L'objectif n'est pas l'algorithme lui-même, qui est simple, mais la **démarche** : chaque ligne de code a été écrite pour faire passer un test, en suivant strictement le cycle rouge → vert → refacto.

## Les règles du kata

Pour un nombre entier donné, la méthode `say` renvoie :

| Cas | Résultat | Exemples |
| --- | --- | --- |
| Multiple de 3 et de 5 | `"FizzBuzz"` | 15, 30, 45 |
| Multiple de 5 | `"Buzz"` | 5, 10, 20 |
| Multiple de 3 | `"Fizz"` | 3, 6, 9 |
| Sinon | le nombre en texte | 1 → `"1"`, 2 → `"2"` |

## La démarche TDD

Chaque fonctionnalité suit le même cycle, avec **un commit par étape** :

1. 🔴 **Rouge** : écrire un test pour un comportement qui n'existe pas encore, et le voir échouer.
2. 🟢 **Vert** : écrire le **minimum** de code pour faire passer le test, même s'il est naïf (par exemple renvoyer `"1"` en dur).
3. 🔵 **Refacto** : améliorer la lisibilité du code sans changer son comportement, avec les tests au vert.

Points d'attention appliqués :

- **La généralisation est pilotée par les tests.** On ne passe de « le nombre vaut 3 » à « le nombre est un multiple de 3 » que lorsqu'un nouveau test rouge (6 → `"Fizz"`) l'impose.
- **Un test par règle**, avec plusieurs exemples par règle pour que les tests protègent vraiment le comportement attendu.
- **Des noms de tests qui décrivent le comportement** (`shouldReturnFizz_whenMultipleOfThree`), pour savoir immédiatement quelle règle est cassée quand un test échoue.

L'historique Git permet de suivre chaque étape du raisonnement :

```bash
git log --oneline --reverse
```

## Stack

- Java (version définie dans le `pom.xml`)
- Maven (via le wrapper inclus, aucune installation nécessaire)
- JUnit Jupiter pour les tests
- AssertJ pour des assertions lisibles

## Lancer les tests

Sous Linux / macOS :

```bash
./mvnw test
```

Sous Windows :

```bash
mvnw.cmd test
```

## Ce que ce kata m'a appris

- Un « refacto » qui change le comportement du code n'est pas un refacto : c'est une nouvelle fonctionnalité, qui doit être demandée par un test.
- Un test qui ne vérifie qu'un seul exemple ne protège pas une règle : il faut plusieurs cas par règle.
- Avec AssertJ, on passe toujours la **valeur réelle** à `assertThat`, et la valeur attendue à `isEqualTo`.

## Pistes d'amélioration

- Remplacer les assertions répétées par des tests paramétrés (`@ParameterizedTest`).
- Extraire une méthode privée `isMultipleOf` pour que le code se lise comme les règles du jeu.