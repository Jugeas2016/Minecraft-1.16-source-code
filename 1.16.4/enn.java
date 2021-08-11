/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Iterator;
/*    */ import java.util.Objects;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ import java.util.function.Consumer;
/*    */ import java.util.stream.Stream;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class enn
/*    */ {
/*    */   public class a
/*    */   {
/*    */     @Nullable
/*    */     private ddu b;
/*    */     private boolean c;
/*    */     
/*    */     public boolean a() {
/* 23 */       return this.c;
/*    */     }
/*    */     
/*    */     public a(enn ☃, ddu ddu1) {
/* 27 */       this.b = ddu1;
/*    */     }
/*    */     
/*    */     public void a(Consumer<ddu> ☃) {
/* 31 */       enn.a(this.a).execute(() -> {
/*    */             if (this.b != null) {
/*    */               ☃.accept(this.b);
/*    */             }
/*    */           });
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public void b() {
/* 41 */       this.c = true;
/* 42 */       enn.b(this.a).a(this.b);
/* 43 */       this.b = null;
/*    */     }
/*    */   }
/*    */   
/* 47 */   private final Set<a> a = Sets.newIdentityHashSet();
/*    */   
/*    */   private final ddv b;
/*    */   
/*    */   private final Executor c;
/*    */   
/*    */   public enn(ddv ☃, Executor executor) {
/* 54 */     this.b = ☃;
/* 55 */     this.c = executor;
/*    */   }
/*    */   
/*    */   public CompletableFuture<a> a(ddv.c ☃) {
/* 59 */     CompletableFuture<a> completableFuture = new CompletableFuture<>();
/* 60 */     this.c.execute(() -> {
/*    */           ddu ddu = this.b.a(☃);
/*    */           if (ddu != null) {
/*    */             a a = new a(this, ddu);
/*    */             this.a.add(a);
/*    */             completableFuture.complete(a);
/*    */           } else {
/*    */             completableFuture.complete(null);
/*    */           } 
/*    */         });
/* 70 */     return completableFuture;
/*    */   }
/*    */   
/*    */   public void a(Consumer<Stream<ddu>> ☃) {
/* 74 */     this.c.execute(() -> ☃.accept(this.a.stream().map(()).filter(Objects::nonNull)));
/*    */   }
/*    */   
/*    */   public void a() {
/* 78 */     this.c.execute(() -> {
/*    */           Iterator<a> ☃ = this.a.iterator();
/*    */           while (☃.hasNext()) {
/*    */             a a = ☃.next();
/*    */             a.a(a).i();
/*    */             if (a.a(a).g()) {
/*    */               a.b();
/*    */               ☃.remove();
/*    */             } 
/*    */           } 
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 93 */     this.a.forEach(a::b);
/* 94 */     this.a.clear();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */