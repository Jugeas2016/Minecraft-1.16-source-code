/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rw
/*    */   implements oj<om>
/*    */ {
/*    */   private List<boq<?>> a;
/*    */   
/*    */   public rw() {}
/*    */   
/*    */   public rw(Collection<boq<?>> ☃) {
/* 22 */     this.a = Lists.newArrayList(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 27 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 32 */     this.a = Lists.newArrayList();
/* 33 */     int i = ☃.i();
/* 34 */     for (int j = 0; j < i; j++) {
/* 35 */       this.a.add(c(☃));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 41 */     ☃.d(this.a.size());
/* 42 */     for (boq<?> boq : this.a) {
/* 43 */       a(boq, ☃);
/*    */     }
/*    */   }
/*    */   
/*    */   public List<boq<?>> b() {
/* 48 */     return this.a;
/*    */   }
/*    */   
/*    */   public static boq<?> c(nf ☃) {
/* 52 */     vk vk1 = ☃.p();
/* 53 */     vk vk2 = ☃.p();
/*    */     
/* 55 */     return ((bos<boq<?>>)gm.ae.b(vk1)
/* 56 */       .orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + ☃)))
/* 57 */       .a(vk2, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T extends boq<?>> void a(T ☃, nf nf1) {
/* 62 */     nf1.a(gm.ae.b(☃.ag_()));
/* 63 */     nf1.a(☃.f());
/* 64 */     ☃.ag_().a(nf1, ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */