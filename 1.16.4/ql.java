/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ public class ql
/*    */   implements oj<om>
/*    */ {
/*    */   private a a;
/*    */   private List<vk> b;
/*    */   private List<vk> c;
/*    */   private adu d;
/*    */   
/*    */   public enum a {
/* 16 */     a, b, c;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ql() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ql(a ☃, Collection<vk> collection1, Collection<vk> collection2, adu adu1) {
/* 29 */     this.a = ☃;
/* 30 */     this.b = (List<vk>)ImmutableList.copyOf(collection1);
/* 31 */     this.c = (List<vk>)ImmutableList.copyOf(collection2);
/* 32 */     this.d = adu1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 37 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 42 */     this.a = ☃.<a>a(a.class);
/*    */     
/* 44 */     this.d = adu.a(☃);
/*    */     
/* 46 */     int i = ☃.i();
/* 47 */     this.b = Lists.newArrayList(); int j;
/* 48 */     for (j = 0; j < i; j++) {
/* 49 */       this.b.add(☃.p());
/*    */     }
/*    */     
/* 52 */     if (this.a == a.a) {
/* 53 */       i = ☃.i();
/* 54 */       this.c = Lists.newArrayList();
/* 55 */       for (j = 0; j < i; j++) {
/* 56 */         this.c.add(☃.p());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 63 */     ☃.a(this.a);
/*    */     
/* 65 */     this.d.b(☃);
/*    */     
/* 67 */     ☃.d(this.b.size());
/* 68 */     for (vk vk : this.b) {
/* 69 */       ☃.a(vk);
/*    */     }
/*    */     
/* 72 */     if (this.a == a.a) {
/* 73 */       ☃.d(this.c.size());
/* 74 */       for (vk vk : this.c) {
/* 75 */         ☃.a(vk);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public List<vk> b() {
/* 81 */     return this.b;
/*    */   }
/*    */   
/*    */   public List<vk> c() {
/* 85 */     return this.c;
/*    */   }
/*    */   
/*    */   public adu d() {
/* 89 */     return this.d;
/*    */   }
/*    */   
/*    */   public a e() {
/* 93 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ql.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */