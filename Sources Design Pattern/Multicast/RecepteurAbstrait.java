
public interface RecepteurAbstrait
  <TMessage extends MessageAbstrait> 
{
  public void recoit(TMessage message);
}
