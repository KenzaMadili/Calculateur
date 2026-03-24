# 📱 Application Android – Calcul d’Impôt

## 📝 Description

Cette application Android permet de calculer un **impôt immobilier** en fonction de plusieurs paramètres saisis par l’utilisateur :

* La **surface** du bien (en m²)
* Le **nombre de pièces**
* La présence ou non d’une **piscine**

Le résultat est affiché dynamiquement après avoir cliqué sur le bouton *Calculer*.

---

## 🎯 Objectifs du LAB

* Manipuler les composants d’interface (EditText, Button, CheckBox, TextView)
* Récupérer et traiter les données saisies par l’utilisateur
* Implémenter une logique de calcul en Java
* Améliorer l’interface utilisateur avec des styles personnalisés

---

## ⚙️ Fonctionnalités

* ✔️ Saisie de la surface du bien
* ✔️ Saisie du nombre de pièces
* ✔️ Option piscine (CheckBox)
* ✔️ Calcul automatique de l’impôt
* ✔️ Affichage du résultat
* ✔️ Gestion des erreurs (champs vides ou invalides)

---

## 🧮 Formule de calcul

L’impôt est calculé comme suit :

* **Impôt de base** = Surface × 2
* **Supplément** = (Nombre de pièces × 50) + (100 si piscine)
* **Impôt total** = Impôt de base + Supplément

---

## 📸 Captures d’écran

### 🔹 Interface principale

![Interface](intfc.png)

---

## 🛠️ Technologies utilisées

* **Langage** : Java
* **IDE** : Android Studio
* **Interface** : XML

---

## ▶️ Exécution de l’application

1. Ouvrir le projet avec **Android Studio**
2. Lancer l’application via :

   * un émulateur Android
   * ou un appareil Android réel
3. Remplir les champs :

   * Surface
   * Nombre de pièces
   * Cocher/décocher piscine
4. Cliquer sur **Calculer**
5. Visualiser le résultat

---

## 📂 Structure du projet

```
app/
 ├── java/.../MainActivity.java
 ├── res/
 │   ├── layout/activity_main.xml
 │   ├── values/colors.xml
 │   ├── drawable/
```

---

## 💡 Améliorations possibles

* Ajouter un bouton de réinitialisation
* Valider les entrées en temps réel
* Améliorer le design avec Material Design
* Ajouter une animation lors du calcul

---

## 👩‍💻 Réalisé par

**Kenza Madili**

---

## 📌 Conclusion

Ce LAB a permis de comprendre comment récupérer des données utilisateur, effectuer un traitement logique et afficher un résultat dans une application Android.
Il constitue une étape importante dans l’apprentissage du développement mobile.
