TeamIterator iterator = new TeamIterator(teamRepository.getAll());

while(iterator.hasNext()){
    Team team = iterator.next();
    System.out.println(team.getName());
}
