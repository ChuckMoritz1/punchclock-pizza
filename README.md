# M223: Punchclock
Dies ist eine Beispielapplikation für das Modul M223. Das Projekt wurde zusätlich erweitert um eine Pizza Verwaltung.

## Loslegen
Folgende Schritte befolgen um loszulegen:
1. Sicherstellen, dass JDK 12 installiert und in der Umgebungsvariable `path` definiert ist.
2. Ins Verzeichnis der Applikation wechseln und über die Kommandozeile mit `./gradlew bootRun` oder `./gradlew.bat bootRun` starten
3. Unittest mit `./gradlew test` oder `./gradlew.bat test` ausführen.
4. Ein ausführbares JAR kann mit `./gradlew bootJar` oder `./gradlew.bat bootJar` erstellt werden.
5. Das programm starten 
6. Auf localhost:8081/login.html gehen
7. Auf Sign Up klicken und sich einloggen
8. Daten eingeben und "Save" anklicken


Folgende Dienste stehen während der Ausführung im Profil `dev` zur Verfügung:
- REST-Schnittstelle der Applikation: http://localhost:8081
- Dashboard der H2 Datenbank: http://localhost:8081/h2-console

In punchclock_pizza, kann man sienen Pizza-Konsum managen. Man kann jedesmal, wenn man eine Pizza bestellt eintragen von wo man welche Pizza 
bestellt hat und kann zusätzlich eintragen wie lange die Pizza gebracuht hat bis sie ankahm. Es können mehrer Personen auf das Dokument zugreifen.
 