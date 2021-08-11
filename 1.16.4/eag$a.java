/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ 
/*    */ public class a
/*    */   implements eag
/*    */ {
/*    */   protected final dfh a;
/*    */   protected final Map<eao, dfh> b;
/* 27 */   protected Optional<eao> c = Optional.empty();
/* 28 */   protected final Set<dfh> d = Sets.newHashSet();
/*    */   
/*    */   protected a(dfh ☃, Map<eao, dfh> map) {
/* 31 */     this.a = ☃;
/* 32 */     this.b = map;
/*    */   }
/*    */ 
/*    */   
/*    */   public dfq getBuffer(eao ☃) {
/* 37 */     Optional<eao> optional = ☃.B();
/*    */     
/* 39 */     dfh dfh1 = b(☃);
/*    */     
/* 41 */     if (!Objects.equals(this.c, optional)) {
/* 42 */       if (this.c.isPresent()) {
/* 43 */         eao eao1 = this.c.get();
/* 44 */         if (!this.b.containsKey(eao1)) {
/* 45 */           a(eao1);
/*    */         }
/*    */       } 
/* 48 */       if (this.d.add(dfh1)) {
/* 49 */         dfh1.a(☃.x(), ☃.w());
/*    */       }
/* 51 */       this.c = optional;
/*    */     } 
/* 53 */     return dfh1;
/*    */   }
/*    */   
/*    */   private dfh b(eao ☃) {
/* 57 */     return this.b.getOrDefault(☃, this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 62 */     this.c.ifPresent(☃ -> {
/*    */           dfq dfq = getBuffer(☃);
/*    */           if (dfq == this.a) {
/*    */             a(☃);
/*    */           }
/*    */         });
/* 68 */     for (eao ☃ : this.b.keySet()) {
/* 69 */       a(☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(eao ☃) {
/* 74 */     dfh dfh1 = b(☃);
/*    */     
/* 76 */     boolean bool = Objects.equals(this.c, ☃.B());
/*    */     
/* 78 */     if (!bool && dfh1 == this.a) {
/*    */       return;
/*    */     }
/*    */     
/* 82 */     if (!this.d.remove(dfh1)) {
/*    */       return;
/*    */     }
/*    */     
/* 86 */     ☃.a(dfh1, 0, 0, 0);
/* 87 */     if (bool)
/* 88 */       this.c = Optional.empty(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eag$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */