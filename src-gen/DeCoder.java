// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/DeCoder.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class DeCoder {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object Alph=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=17;
      Alph=$fix($opUnionY($opIntvlY('0','9'),GCollections.asSet('+','-')));
      $line=19;
      System.out.println($message(new Object[]{"Input strings of the form D0R1\u2025.Rn  where  "}));
      $line=20;
      System.out.println($message(new Object[]{"   D0 is a digit and Ri is 0 or +Digit or -Digit"}));
      $line=23;
      Object decoder=$fix(DeCoder.createTransducer(Alph));
      $line=26;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,decoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,DeCoder.class,"main",$line);
    }
  }
  public static ITransducer createTransducer(Object A) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=33;
      Object Q=$fix($opUnionY($opCartsY(new Object[]{$opIntvlY('0','9'),GCollections.asSet('+','-','*'),GCollections.asSet(true,false)}),GCollections.asSet(GCollections.asList('I','*',false),GCollections.asList('E','*',false))));
      $line=34;
      Object \u03A3=$fix($opUnionY($opIntvlY('0','9'),GCollections.asSet('+','-')));
      $line=35;
      Object O=$fix($opIntvlY('0','9'));
      $line=36;
      Object q_0=$fix(GCollections.asList('I','*',false));
      $line=37;
      Object F=$fix($opDiffeY(Q,GCollections.asSet(GCollections.asList('E','*',false))));
      $line=38;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,O,q_0,F,new GMethod(DeCoder.class,"\u03B4"),new GMethod(DeCoder.class,"g"),new GMethod(DeCoder.class,"h")});
      if (true) break $try;
      $line=39;
      $rethrow(new RuntimeException("The function \"createTransducer(A:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,DeCoder.class,"createTransducer",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object simbolo=$v2.next();
      Object signo=$v2.next();
      Object esMasOMenos=$v2.next();
      $line=47;
      if (($opEqualY(esMasOMenos,true)&&$opEqualY(\u03C3,'0'))) {
        $line=47;
        $result=GCollections.asList('E','*',false);
        if (true) break $try;
      }
      else {
        $line=50;
        if ((($opEqualY(esMasOMenos,false)&&!$opEqualY(simbolo,'I'))&&$opMembrY(\u03C3,$opIntvlY('1','9')))) {
          $line=50;
          $result=GCollections.asList('E','*',false);
          if (true) break $try;
        }
        else {
          $line=53;
          if (($opEqualY(GCollections.asList(simbolo,signo,esMasOMenos),GCollections.asList('I','*',false))&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
            $line=53;
            $result=GCollections.asList(\u03C3,signo,false);
            if (true) break $try;
          }
          else {
            $line=55;
            if ((((!$opEqualY(simbolo,'E')&&!$opEqualY(simbolo,'I'))&&$opEqualY(signo,'*'))&&$bool(($opEqualY(\u03C3,'+')||$opEqualY(\u03C3,'-'))))) {
              $line=55;
              $result=GCollections.asList(simbolo,\u03C3,true);
              if (true) break $try;
            }
            else {
              $line=57;
              if ((((!$opEqualY(simbolo,'E')&&!$opEqualY(simbolo,'I'))&&$opEqualY(signo,'*'))&&$opMembrY(\u03C3,$opIntvlY('0','9')))) {
                $line=57;
                $result=GCollections.asList(simbolo,signo,false);
                if (true) break $try;
              }
              else {
                $line=62;
                if ((($opEqualY(signo,'+')&&$opMembrY(\u03C3,$opIntvlY('1','9')))&&$bool($opLessqY($opAdditY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,\u03C3))),9)))) {
                  $line=62;
                  $result=GCollections.asList(Character.forDigit($int($opAdditY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,\u03C3)))),$int(10)),signo,false);
                  if (true) break $try;
                }
                else {
                  $line=63;
                  if ((($opEqualY(signo,'-')&&$opMembrY(\u03C3,$opIntvlY('1','9')))&&$bool($opGreaqY($opSubtrY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,\u03C3))),0)))) {
                    $line=63;
                    $result=GCollections.asList(Character.forDigit($int($opSubtrY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,\u03C3)))),$int(10)),signo,false);
                    if (true) break $try;
                  }
                  else {
                    $line=66;
                    if ((!$opEqualY(signo,'*')&&$opEqualY(\u03C3,'0'))) {
                      $line=66;
                      $result=GCollections.asList(simbolo,signo,false);
                      if (true) break $try;
                    }
                    else {
                      $line=69;
                      if ((!$opEqualY(signo,'*')&&$opMembrY(\u03C3,GCollections.asSet('+','-')))) {
                        $line=69;
                        $result=GCollections.asList(simbolo,\u03C3,true);
                        if (true) break $try;
                      }
                      else {
                        $line=72;
                        $result=GCollections.asList('E','*',false);
                        if (true) break $try;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=75;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8simbolo,signo,esMasOMenos\u27E9:java.lang.Iterable,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,DeCoder.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object g(java.lang.Iterable $v3) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object simbolo=$v4.next();
      Object signo=$v4.next();
      $line=78;
      $result="";
      if (true) break $try;
      $line=79;
      $rethrow(new RuntimeException("The function \"g(\u27E8simbolo,signo\u27E9:java.lang.Iterable)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,DeCoder.class,"g",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v5, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object simbolo=$v6.next();
      Object signo=$v6.next();
      $line=82;
      if (($opEqualY(GCollections.asList(simbolo,signo),GCollections.asList('I','*'))&&$opMembrY(s,$opIntvlY('0','9')))) {
        $line=82;
        $result=s;
        if (true) break $try;
      }
      else {
        $line=83;
        if (($opEqualY(s,'0')&&$opMembrY(simbolo,$opIntvlY('0','9')))) {
          $line=83;
          $result=simbolo;
          if (true) break $try;
        }
        else {
          $line=84;
          if ((($opEqualY(signo,'+')&&$opMembrY(s,$opIntvlY('1','9')))&&$bool($opLessqY($opAdditY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,s))),9)))) {
            $line=84;
            $result=$opAdditY(Integer.parseInt($cast(java.lang.String.class,s)),Integer.parseInt($cast(java.lang.String.class,simbolo)));
            if (true) break $try;
          }
          else {
            $line=85;
            if ((($opEqualY(signo,'-')&&$opMembrY(s,$opIntvlY('1','9')))&&$bool($opGreaqY($opSubtrY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,s))),0)))) {
              $line=85;
              $result=$opSubtrY(Integer.parseInt($cast(java.lang.String.class,simbolo)),Integer.parseInt($cast(java.lang.String.class,s)));
              if (true) break $try;
            }
            else {
              $line=86;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=89;
      $rethrow(new RuntimeException("The function \"h(\u27E8simbolo,signo\u27E9:java.lang.Iterable,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,DeCoder.class,"h",$line);
    }
    return $result;
  }
}
