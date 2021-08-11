/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ public class dzt
/*    */ {
/*    */   private final Map<eao, dfh> a;
/*    */   
/*    */   public dzt() {
/*  9 */     this.a = (Map<eao, dfh>)eao.u().stream().collect(Collectors.toMap(☃ -> ☃, ☃ -> new dfh(☃.v())));
/*    */   }
/*    */   public dfh a(eao ☃) {
/* 12 */     return this.a.get(☃);
/*    */   }
/*    */   
/*    */   public void a() {
/* 16 */     this.a.values().forEach(dfh::g);
/*    */   }
/*    */   
/*    */   public void b() {
/* 20 */     this.a.values().forEach(dfh::h);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */