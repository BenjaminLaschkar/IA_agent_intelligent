# IA_agent_intelligent

Exercice de modélisation d'un agent intelligent<br><br>
Dans cette exercice on programme en java 2 entités : Environnement et Agent.<br>
Chaque entité est sur un thread différent.

# Agent

L’agent va choisir aléatoirement un but à adopter parmis 3. (A,B,C) <br><br>
Pour accomplir le but A, il doit effectuer 3 tâches : a1 puis a2 puis a3 <br>
Pour accomplir le but B, il doit effectuer 3 tâches : b1 puis b2 puis b3 <br>
Pour accomplir le but C, il doit effectuer 3 tâches : c1 puis c2 puis c3 <br>
Chaque tâche dure 1,5 seconde. 

# Environnement

L’environnement à deux état, toute les 10 secondes il genere une information, “OK” ou “DANGER”.<br>
Danger à une plus faible probabilité de se produire. (2 chances sur 10)<br>

# Intelligence de l'agent

L’agent observe l’environnement.<br>
L'agent ne fais rien pendant le danger.<br>
L'Agent meure si le danger s’active et qu’il fait quelque chose. (Il doit mourir, en ayant été tué par l'environnement)
