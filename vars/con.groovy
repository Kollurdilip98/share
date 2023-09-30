
def down(repo)
{
  git "https://github.com/Kollurdilip98/${repo}.git"
}
def build()
{
sh 'mvn package'
}
def test(jobname,qa,dest)
{
sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${qa}:/var/lib/tomcat9/webapps/${dest}.war"
}
