/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cfb
/*    */   extends cfe<gc>
/*    */ {
/*    */   protected cfb(String ☃, Collection<gc> collection) {
/* 14 */     super(☃, gc.class, collection);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static cfb a(String ☃, Predicate<gc> predicate) {
/* 22 */     return a(☃, (Collection<gc>)Arrays.<gc>stream(gc.values()).filter(predicate).collect(Collectors.toList()));
/*    */   }
/*    */   
/*    */   public static cfb a(String ☃, gc... arrayOfGc) {
/* 26 */     return a(☃, Lists.newArrayList((Object[])arrayOfGc));
/*    */   }
/*    */   
/*    */   public static cfb a(String ☃, Collection<gc> collection) {
/* 30 */     return new cfb(☃, collection);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */