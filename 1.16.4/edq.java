/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class edq
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/* 22 */   private final Map<chd, Map<String, cra>> b = Maps.newIdentityHashMap();
/* 23 */   private final Map<chd, Map<String, cra>> c = Maps.newIdentityHashMap();
/* 24 */   private final Map<chd, Map<String, Boolean>> d = Maps.newIdentityHashMap();
/*    */ 
/*    */ 
/*    */   
/*    */   public edq(djz ☃) {
/* 29 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 34 */     djk djk = this.a.h.k();
/* 35 */     bry bry = this.a.r;
/* 36 */     chd chd = bry.k();
/*    */     
/* 38 */     fx fx = new fx((djk.b()).b, 0.0D, (djk.b()).d);
/*    */     
/* 40 */     dfq dfq = eag1.getBuffer(eao.t());
/*    */     
/* 42 */     if (this.b.containsKey(chd)) {
/* 43 */       for (cra cra : ((Map)this.b.get(chd)).values()) {
/* 44 */         if (fx.a(cra.g(), 500.0D)) {
/* 45 */           eae.a(☃, dfq, cra.a - d1, cra.b - d2, cra.c - d3, (cra.d + 1) - d1, (cra.e + 1) - d2, (cra.f + 1) - d3, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F);
/*    */         }
/*    */       } 
/*    */     }
/*    */     
/* 50 */     if (this.c.containsKey(chd)) {
/* 51 */       for (Map.Entry<String, cra> entry : (Iterable<Map.Entry<String, cra>>)((Map)this.c.get(chd)).entrySet()) {
/* 52 */         String str = entry.getKey();
/* 53 */         cra cra = entry.getValue();
/* 54 */         Boolean bool = (Boolean)((Map)this.d.get(chd)).get(str);
/*    */         
/* 56 */         if (fx.a(cra.g(), 500.0D)) {
/* 57 */           if (bool.booleanValue()) {
/* 58 */             eae.a(☃, dfq, cra.a - d1, cra.b - d2, cra.c - d3, (cra.d + 1) - d1, (cra.e + 1) - d2, (cra.f + 1) - d3, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F); continue;
/*    */           } 
/* 60 */           eae.a(☃, dfq, cra.a - d1, cra.b - d2, cra.c - d3, (cra.d + 1) - d1, (cra.e + 1) - d2, (cra.f + 1) - d3, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F);
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(cra ☃, List<cra> list, List<Boolean> list1, chd chd1) {
/* 68 */     if (!this.b.containsKey(chd1)) {
/* 69 */       this.b.put(chd1, Maps.newHashMap());
/*    */     }
/*    */     
/* 72 */     if (!this.c.containsKey(chd1)) {
/* 73 */       this.c.put(chd1, Maps.newHashMap());
/* 74 */       this.d.put(chd1, Maps.newHashMap());
/*    */     } 
/*    */     
/* 77 */     ((Map<String, cra>)this.b.get(chd1)).put(☃.toString(), ☃);
/* 78 */     for (int i = 0; i < list.size(); i++) {
/* 79 */       cra cra1 = list.get(i);
/* 80 */       Boolean bool = list1.get(i);
/* 81 */       ((Map<String, cra>)this.c.get(chd1)).put(cra1.toString(), cra1);
/* 82 */       ((Map<String, Boolean>)this.d.get(chd1)).put(cra1.toString(), bool);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 88 */     this.b.clear();
/* 89 */     this.c.clear();
/* 90 */     this.d.clear();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */