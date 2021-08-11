/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class enb
/*    */   implements aci
/*    */ {
/*    */   public static class a<T> {}
/*    */   
/* 14 */   public static final a<bmb> a = new a<>();
/* 15 */   public static final a<bmb> b = new a<>();
/* 16 */   public static final a<drt> c = new a<>();
/*    */   
/* 18 */   private final Map<a<?>, emy<?>> d = Maps.newHashMap();
/*    */ 
/*    */   
/*    */   public void a(ach ☃) {
/* 22 */     for (emy<?> emy : this.d.values()) {
/* 23 */       emy.b();
/*    */     }
/*    */   }
/*    */   
/*    */   public <T> void a(a<T> ☃, emy<T> emy1) {
/* 28 */     this.d.put(☃, emy1);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> emy<T> a(a<T> ☃) {
/* 33 */     return (emy<T>)this.d.get(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */