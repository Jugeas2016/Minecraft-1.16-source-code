/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface nu
/*    */ {
/* 10 */   public static final Optional<afx> b = Optional.of(afx.a);
/*    */   
/* 12 */   public static final nu c = new nu()
/*    */     {
/*    */       public <T> Optional<T> a(nu.a<T> ☃) {
/* 15 */         return Optional.empty();
/*    */       }
/*    */ 
/*    */       
/*    */       public <T> Optional<T> a(nu.b<T> ☃, ob ob1) {
/* 20 */         return Optional.empty();
/*    */       }
/*    */     };
/*    */   
/*    */   <T> Optional<T> a(a<T> parama);
/*    */   
/*    */   <T> Optional<T> a(b<T> paramb, ob paramob);
/*    */   
/*    */   static nu b(String ☃) {
/* 29 */     return new nu(☃)
/*    */       {
/*    */         public <T> Optional<T> a(nu.a<T> ☃) {
/* 32 */           return ☃.accept(this.a);
/*    */         }
/*    */ 
/*    */         
/*    */         public <T> Optional<T> a(nu.b<T> ☃, ob ob1) {
/* 37 */           return ☃.accept(ob1, this.a);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   static nu a(String ☃, ob ob1) {
/* 43 */     return new nu(☃, ob1)
/*    */       {
/*    */         public <T> Optional<T> a(nu.a<T> ☃) {
/* 46 */           return ☃.accept(this.a);
/*    */         }
/*    */ 
/*    */         
/*    */         public <T> Optional<T> a(nu.b<T> ☃, ob ob1) {
/* 51 */           return ☃.accept(this.d.a(ob1), this.a);
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   static nu a(nu... ☃) {
/* 57 */     return a((List<nu>)ImmutableList.copyOf((Object[])☃));
/*    */   }
/*    */   
/*    */   static nu a(List<nu> ☃) {
/* 61 */     return new nu(☃)
/*    */       {
/*    */         public <T> Optional<T> a(nu.a<T> ☃) {
/* 64 */           for (nu nu1 : this.a) {
/* 65 */             Optional<T> optional = nu1.a(☃);
/* 66 */             if (optional.isPresent()) {
/* 67 */               return optional;
/*    */             }
/*    */           } 
/*    */           
/* 71 */           return Optional.empty();
/*    */         }
/*    */ 
/*    */         
/*    */         public <T> Optional<T> a(nu.b<T> ☃, ob ob1) {
/* 76 */           for (nu nu1 : this.a) {
/* 77 */             Optional<T> optional = nu1.a(☃, ob1);
/* 78 */             if (optional.isPresent()) {
/* 79 */               return optional;
/*    */             }
/*    */           } 
/*    */           
/* 83 */           return Optional.empty();
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   default String getString() {
/* 89 */     StringBuilder ☃ = new StringBuilder();
/*    */     
/* 91 */     a(str -> {
/*    */           ☃.append(str);
/*    */           
/*    */           return Optional.empty();
/*    */         });
/* 96 */     return ☃.toString();
/*    */   }
/*    */   
/*    */   public static interface b<T> {
/*    */     Optional<T> accept(ob param1ob, String param1String);
/*    */   }
/*    */   
/*    */   public static interface a<T> {
/*    */     Optional<T> accept(String param1String);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */